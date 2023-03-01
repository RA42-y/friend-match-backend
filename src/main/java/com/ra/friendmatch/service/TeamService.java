package com.ra.friendmatch.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ra.friendmatch.model.domain.Team;
import com.ra.friendmatch.model.domain.User;
import com.ra.friendmatch.model.dto.TeamQuery;
import com.ra.friendmatch.model.request.TeamJoinRequest;
import com.ra.friendmatch.model.request.TeamQuitRequest;
import com.ra.friendmatch.model.request.TeamUpdateRequest;
import com.ra.friendmatch.model.vo.TeamUserVO;
//import com.ra.friendmatch.model.request.TeamJoinRequest;
//import com.ra.friendmatch.model.request.TeamQuitRequest;
//import com.ra.friendmatch.model.request.TeamUpdateRequest;
//import com.ra.friendmatch.model.vo.TeamUserVO;

import java.util.List;



/**
 * @author jieniyu
 * @description 针对表【team(队伍)】的数据库操作Service
 * @createDate 2023-02-18 14:59:42
 */

public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);


    /**
     * 搜索队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);


    /**
     * 加入队伍
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);


    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
