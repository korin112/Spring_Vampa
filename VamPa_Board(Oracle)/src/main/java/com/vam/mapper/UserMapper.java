package com.vam.mapper;

import java.util.List;

import com.vam.model.UserDTO;

public interface UserMapper {
    /* 유저 등록 */
    public void join(UserDTO user);
    
    /* 유저 로그인 */
    public UserDTO login(UserDTO user);
    
    /* 유저 목록 */
    public List<UserDTO> getList();
    
    /* 유저 상세 조회 */
    public UserDTO getDetail(String userId);
    
    /* 유저 수정 */
    public int modify(UserDTO user);
    
    /* 유저 삭제 */
    public int delete(int bno);
    
    /* 아이디 중복검사 */
	public int idCheck(String userId);
}
