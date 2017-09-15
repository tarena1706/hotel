package com.springboot.pojo;

/**
 * 用户类(对应user表)
 *
 * @author zah
 *
 */
public class User {

	private Integer id;			// 用户id
	private String username;		// 用户名
	private String password;		// 用户密码
	private String nickname;		// 昵称
	private String email;			// 邮箱
	private String phonenumber;	//手机
	private String role;			// 用户角色，管理员admin或普通用户user
	private String sex;			//性别
	private int reserveRoom;		//预定房间
	private int checkinRoom;		//入住房间
	private int level;				//会员

	/**
	 * 执行数据校验
	 * 	<ol>
	 * 		<li>用户名非空校验</li>
	 * 		<li>密码非空校验</li>
	 * 		<li>确认密码非空校验</li>
	 * 		<li>密码和确认密码一致性校验</li>
	 * 		<li>昵称非空校验</li>
	 * 		<li>邮箱非空校验</li>
	 * 		<li>邮箱格式校验</li>
	 *  </ol>
//	 * @throws MsgException
//	 */
//	public void checkData() throws MsgException{
//		if (StringUtils.isNull(username)) {
//			throw new MsgException("用户名不能为空");
//		}
//		if (StringUtils.isNull(password)) {
//			throw new MsgException("密码不能为空");
//		}
//		if (StringUtils.isNull(password2)) {
//			throw new MsgException("确认密码不能为空");
//		}
//		if(!password.equals(password2)){
//			throw new MsgException("两次密码不一致");
//		}
//		if (StringUtils.isNull(nickname)) {
//			throw new MsgException("昵称不能为空");
//		}
//		if (StringUtils.isNull(email)) {
//			throw new MsgException("邮箱不能为空");
//		}
//		if(!email.matches("^\\w+@\\w+(\\.\\w+)+$")){
//			throw new MsgException("邮箱格式不正确");
//		}
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getReserveRoom() {
		return reserveRoom;
	}

	public void setReserveRoom(int reserveRoom) {
		this.reserveRoom = reserveRoom;
	}

	public int getCheckinRoom() {
		return checkinRoom;
	}

	public void setCheckinRoom(int checkinRoom) {
		this.checkinRoom = checkinRoom;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
