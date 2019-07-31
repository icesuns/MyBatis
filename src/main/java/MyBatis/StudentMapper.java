package MyBatis;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public Student getStudentById(int id) throws Exception;

    /**
     *
     * @param age
     * @param id
     * @throws Exception
     */
    public void updateStudentAgeById(@Param("age")int age, @Param("id")int id) throws Exception;
}
