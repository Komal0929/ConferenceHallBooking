package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="booking_tbl")
@NamedQuery(name="BookingTbl.findAll", query="SELECT b FROM BookingTbl b")
public class BookingTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="booking_id")
	private int bookingId;

	@Column(name="booking_amount")
	private double bookingAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="booking_conference_date")
	private Date bookingConferenceDate;

	@Temporal(TemporalType.DATE)
	@Column(name="booking_date")
	private Date bookingDate;

	@Column(name="booking_end_time")
	private Time bookingEndTime;

	@Column(name="booking_start_time")
	private Time bookingStartTime;

	@Column(name="booking_status")
	private String bookingStatus;

	@Column(name="booking_total_guests")
	private int bookingTotalGuests;

	//bi-directional many-to-one association to ConferenceRoomTbl
	@ManyToOne
	@JoinColumn(name="confroom_id")
	private ConferenceRoomTbl conferenceRoomTbl;

	//bi-directional many-to-one association to HotelTbl
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private HotelTbl hotelTbl;

	//bi-directional many-to-one association to UserInfoTbl
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfoTbl userInfoTbl;

	//bi-directional many-to-one association to FeedbackTbl
	@OneToMany(mappedBy="bookingTbl")
	private List<FeedbackTbl> feedbackTbls;

	public BookingTbl() {
	}

	public int getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public double getBookingAmount() {
		return this.bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public Date getBookingConferenceDate() {
		return this.bookingConferenceDate;
	}

	public void setBookingConferenceDate(Date bookingConferenceDate) {
		this.bookingConferenceDate = bookingConferenceDate;
	}

	public Date getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Time getBookingEndTime() {
		return this.bookingEndTime;
	}

	public void setBookingEndTime(Time bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}

	public Time getBookingStartTime() {
		return this.bookingStartTime;
	}

	public void setBookingStartTime(Time bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getBookingTotalGuests() {
		return this.bookingTotalGuests;
	}

	public void setBookingTotalGuests(int bookingTotalGuests) {
		this.bookingTotalGuests = bookingTotalGuests;
	}

	public ConferenceRoomTbl getConferenceRoomTbl() {
		return this.conferenceRoomTbl;
	}

	public void setConferenceRoomTbl(ConferenceRoomTbl conferenceRoomTbl) {
		this.conferenceRoomTbl = conferenceRoomTbl;
	}

	public HotelTbl getHotelTbl() {
		return this.hotelTbl;
	}

	public void setHotelTbl(HotelTbl hotelTbl) {
		this.hotelTbl = hotelTbl;
	}

	public UserInfoTbl getUserInfoTbl() {
		return this.userInfoTbl;
	}

	public void setUserInfoTbl(UserInfoTbl userInfoTbl) {
		this.userInfoTbl = userInfoTbl;
	}

	public List<FeedbackTbl> getFeedbackTbls() {
		return this.feedbackTbls;
	}

	public void setFeedbackTbls(List<FeedbackTbl> feedbackTbls) {
		this.feedbackTbls = feedbackTbls;
	}

	public FeedbackTbl addFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().add(feedbackTbl);
		feedbackTbl.setBookingTbl(this);

		return feedbackTbl;
	}

	public FeedbackTbl removeFeedbackTbl(FeedbackTbl feedbackTbl) {
		getFeedbackTbls().remove(feedbackTbl);
		feedbackTbl.setBookingTbl(null);

		return feedbackTbl;
	}

}