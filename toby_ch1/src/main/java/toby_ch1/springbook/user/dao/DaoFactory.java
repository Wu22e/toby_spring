package toby_ch1.springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        UserDao dao = new UserDao(connectionMaker());
        return dao;
    }

    // 여기 추가적인 Dao 호출 메소드가 들어올 수 있음.

    // 메소드 추출 리팩토링
    @Bean
    public ConnectionMaker connectionMaker() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return connectionMaker;
    }
}
