package com.dxs.server.service.impl;

import com.dxs.server.pojo.Employee;
import com.dxs.server.mapper.EmployeeMapper;
import com.dxs.server.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dxs
 * @since 2021-02-19
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
