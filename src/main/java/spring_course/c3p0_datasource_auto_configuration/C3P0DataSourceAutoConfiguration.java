package spring_course.c3p0_datasource_auto_configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ConditionalOnClass( ComboPooledDataSource.class )
@AutoConfigureBefore( DataSourceAutoConfiguration.class )
@ConditionalOnMissingBean( DataSource.class )
@EnableConfigurationProperties( C3P0DataSourceProperties.class )
public class C3P0DataSourceAutoConfiguration
{
   @Bean
   public DataSource c3p0DataSource( final C3P0DataSourceProperties dataSourceProperties )
      throws PropertyVetoException
   {
      final var dataSource = new ComboPooledDataSource();
      dataSource.setDriverClass( dataSourceProperties.getDriverClass() );
      dataSource.setJdbcUrl( dataSourceProperties.getJdbcUrl() );
      dataSource.setUser( dataSourceProperties.getUser() );
      dataSource.setPassword( dataSourceProperties.getPassword() );

      dataSource.setMinPoolSize( dataSourceProperties.getMinPoolSize() );
      dataSource.setMaxPoolSize( dataSource.getMaxPoolSize() );
      return dataSource;
   }
}
