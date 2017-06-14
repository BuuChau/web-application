package com.ccteam.service.admin;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = RuntimeException.class)
@Service
public class AdminService {


}
