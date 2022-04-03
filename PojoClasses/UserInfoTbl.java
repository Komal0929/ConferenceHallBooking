package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user_info_tbl database table.
 * 
 */
@Entity
@Table(name="user_info_tbl")
@NamedQuery(name="UserInfoTbl.findAll", query="SELECT u FROM UserInfoTbl u")
public class UserInfoTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private int userId;

	@Column(name="user_city")
	private String userCity;

	@Column(name="user_contact_number")
	private String userContactNumber;

	@Column(name="user_district")
	private String userDistrict;

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_email")
	private String userEmail;

	@Column(name="user_firstname")
	private String userFirstname;

	@Column(name="user_firstname")
	private String userFirstname;

	@Column(name="user_lastname")
	private String userLastname;

	@Column(name="user_lastname")
	private String userLastname;

	@Column(name="user_mobile")
	private String userMobile;

	@Column(name="user_occupation")
	private String userOccupation;

	@Column(name="user_password")
	private String userPassword;

	@Column(name="user_password")
	private String userPassword;

	@Column(name="user_pin")
	private int userPin;

	@Column(name="user_state")
	private String userState;

	@Column(name="user_uname")
	private String userUname;

	@Column(name="user_username")
	private String userUsername;

	//bi-directional many-to-one association to BookingTbl
	@OneToMany(mappedBy="userInfoTbl")
	private List<BookingTbl> bookingTbls;

	//bi-directional many-to-one association to FeedbackTbl
	@OneToMany(mappedBy="userInfoTbl")
	private List<FeedbackTbl> feedbackTbls;

	public UserInfoTbl() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserCity() {
		return this.userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserContactNumber() {
		return this.userContactNumber;
	}

	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserDistrict() {
		return this.userDistrict;
	}

	public void setUserDistrict(String userDistrict) {
		this.userDistrict = userDistrict;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFirstname() {
		return this.userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserFirstname() {
		return this.userFirstname;
	}

	public void setUserFirstname(String userFirstname) {
		this.userFirstname = userFirstname;
	}

	public String getUserLastname() {
		return this.userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUserLastname() {
		return this.userLastname;
	}

	public void setUserLastname(String userLastname) {
		this.userLastname = userLastname;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserOccupation() {
		return this.userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserPin() {
		return this.userPin;
	}

	public void setUserPin(int userPin) {
		this.userPin = userPin;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserUname() {
		return this.userUname;
	}

	public void setUserUname(String userUname) {
		this.userUname = userUname;
	}

	public String getUserUsername() {
		return this.userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public List<BookingTbl> getBookingTbls() {
		return this.bookingTbls;
	}

	public void setBookingTbls(List<BookingTbl> bookingTbls) {
		this.bookingTbls = bookingTbls;
	}

	public BookingTbl addBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().add(bookingTbl);
		bookingTbl.setUserInfoTbl(this);

		return bookingTbl;
	}

	public BookingTbl removeBookingTbl(BookingTbl bookingTbl) {
		getBookingTbls().remove(bookingTbl);
		bookingTbl.setUserInfoTbl(null);

		return bookingTbl;
	}

	public List<FeedbackTbl> getFeedbackTbls() {
		return this.feedbackTbls;
	}

	public void setFeedbackTbls(List<FeedbackTbl> feedbackTbls) {
		this.feedbackTbls = feedbackTbls;
	}

	public FeedbackTbl addFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().add(feedbackTbl);
		feedbackTbl.setUserInfoTbl(this);

		return feedbackTbl;
	}

	public FeedbackTbl removeFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().remove(feedbackTbl);
		feedbackTbl.setUserInfoTbl(null);

		return feedbackTbl;
	}

}