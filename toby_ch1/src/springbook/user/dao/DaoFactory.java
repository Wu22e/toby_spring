package springbook.user.dao;

public class DaoFactory {
    public UserDao userDao() {
        UserDao dao = new UserDao(connectionMaker());
        return dao;
    }

    // 여기 추가적인 Dao 호출 메소드가 들어올 수 있음.
    
    // 메소드 추출
    public ConnectionMaker connectionMaker() {
        ConnectionMaker connectionMaker = new DConnectionMaker();
        return connectionMaker;
    }
}
