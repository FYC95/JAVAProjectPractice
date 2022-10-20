package fyc.epss.dao;

import java.util.List;

public interface Daoimpl<T> {
    public abstract Boolean deleteByPrimaryKey(Integer id);
    public abstract T seleteByPrimaryKey(Integer id);
    List<T> selectAll();
    Boolean insertSelective(T obj);
    Boolean updateSelective(T obj);

}
