package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the image_tbl database table.
 * 
 */
@Entity
@Table(name="image_tbl")
@NamedQuery(name="ImageTbl.findAll", query="SELECT i FROM ImageTbl i")
public class ImageTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="image_id")
	private int imageId;

	@Lob
	@Column(name="image_data")
	private byte[] imageData;

	//bi-directional many-to-one association to ConferenceRoomTbl
	@ManyToOne
	@JoinColumn(name="confroom_id")
	private ConferenceRoomTbl conferenceRoomTbl;

	//bi-directional many-to-one association to HotelTbl
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private HotelTbl hotelTbl;

	public ImageTbl() {
	}

	public int getImageId() {
		return this.imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public byte[] getImageData() {
		return this.imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
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

}