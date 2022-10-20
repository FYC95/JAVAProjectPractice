package fyc.epss.dao;

import java.util.List;

public class businessDao implements Daoimpl<businessDao>{
    public Boolean deleteByPrimaryKey(Integer id) {
        return false;
    }

    @Override
    public businessDao seleteByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<businessDao> selectAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(businessDao obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(businessDao obj) {
        return null;
    }
}
