package top.cliffside.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cliffside.mapper.EmpMapper;
import top.cliffside.pojo.Emp;
import top.cliffside.service.EmpService;

import java.util.List;

/**
 * @author cliffside
 * @date 2021-05-16 20:57
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> findByPage(Integer pageNum, Integer pageSize) {
        Page<Emp> page = PageHelper.startPage(pageNum, pageSize);
        List<Emp> list =empMapper.findAll();
        // 方式1
        System.out.println("当前页:"+page.getPageNum());
        System.out.println("总页数"+page.getPages());
        System.out.println("页大小:"+page.getPageSize());
        System.out.println("总记录数:"+page.getTotal());
        System.out.println("当前页数据"+page.getResult());
        // 方式2
        PageInfo<Emp> pi =new PageInfo<>(list);
        System.out.println("当前页"+pi.getPageNum());
        System.out.println("总页数"+pi.getPages());
        System.out.println("页大小"+pi.getSize());
        System.out.println("总记录数"+pi.getTotal());
        System.out.println("当前页数据"+pi.getList());
        return list;
    }
}
