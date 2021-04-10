package spring_course.c3p0_datasource_auto_configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties( prefix = "c3p0.datasource" )
public class C3P0DataSourceProperties
{
   private String driverClass_;
   private String jdbcUrl_;
   private String user_;
   private String password_;
   private Integer minPoolSize_;
   private Integer maxPoolSize_;

   public String getDriverClass()
   {
      return driverClass_;
   }

   public void setDriverClass( String driverClass )
   {
      driverClass_ = driverClass;
   }

   public String getJdbcUrl()
   {
      return jdbcUrl_;
   }

   public void setJdbcUrl( String jdbcUrl )
   {
      jdbcUrl_ = jdbcUrl;
   }

   public String getUser()
   {
      return user_;
   }

   public void setUser( String user )
   {
      user_ = user;
   }

   public String getPassword()
   {
      return password_;
   }

   public void setPassword( String password )
   {
      password_ = password;
   }

   public Integer getMinPoolSize()
   {
      return minPoolSize_;
   }

   public void setMinPoolSize( Integer minPoolSize )
   {
      minPoolSize_ = minPoolSize;
   }

   public Integer getMaxPoolSize()
   {
      return maxPoolSize_;
   }

   public void setMaxPoolSize( Integer maxPoolSize )
   {
      maxPoolSize_ = maxPoolSize;
   }
}
