package MyBatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "Mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        try{
//            Student student = mapper.getStudentById(2);
//            System.out.println(student.getName());
            mapper.updateStudentAgeById(2, 6);
            sqlSession.commit();
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
