package com.ra.friendmatch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ra.friendmatch.model.domain.UserTeam;
import com.ra.friendmatch.mapper.UserTeamMapper;
import com.ra.friendmatch.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author jieniyu
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-02-18 15:01:14
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




