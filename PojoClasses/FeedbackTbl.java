package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the feedback_tbl database table.
 * 
 */
@Entity
@Table(name="feedback_tbl")
@NamedQuery(name="FeedbackTbl.findAll", query="SELECT f FROM FeedbackTbl f")
public class FeedbackTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="feedback_id")
	private int feedbackId;

	@Column(name="feedback_comment")
	private String feedbackComment;

	@Temporal(TemporalType.DATE)
	@Column(name="feedback_date")
	private Date feedbackDate;

	@Column(name="feedback_rating")
	private int feedbackRating;

	//bi-directional many-to-one association to BookingTbl
	@ManyToOne
	@JoinColumn(name="booking_id")
	private BookingTbl bookingTbl;

	//bi-directional many-to-one association to UserInfoTbl
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfoTbl userInfoTbl;

	public FeedbackTbl() {
	}

	public int getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackComment() {
		return this.feedbackComment;
	}

	public void setFeedbackComment(String feedbackComment) {
		this.feedbackComment = feedbackComment;
	}

	public Date getFeedbackDate() {
		return this.feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public int getFeedbackRating() {
		return this.feedbackRating;
	}

	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	public BookingTbl getBookingTbl() {
		return this.bookingTbl;
	}

	public void setBookingTbl(BookingTbl bookingTbl) {
		this.bookingTbl = bookingTbl;
	}

	public UserInfoTbl getUserInfoTbl() {
		return this.userInfoTbl;
	}

	public void setUserInfoTbl(UserInfoTbl userInfoTbl) {
		this.userInfoTbl = userInfoTbl;
	}

}