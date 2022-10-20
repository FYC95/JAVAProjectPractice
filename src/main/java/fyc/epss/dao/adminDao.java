package fyc.epss.dao;

import java.util.List;

public class adminDao implements Daoimpl<adminDao>{

    @Override
    public Boolean deleteByPrimaryKey(Integer id) {
        return false;
    }

    @Override
    public adminDao seleteByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<adminDao> selectAll() {
        return null;
    }

    @Override
    public Boolean insertSelective(adminDao obj) {
        return null;
    }

    @Override
    public Boolean updateSelective(adminDao obj) {
        return null;
    }
}
