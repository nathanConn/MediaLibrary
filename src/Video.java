
public class Video extends Media {

	private String director;
	private String title;
	private String actor;
	private String actress;
	private int minutes;

	public Video(String t, String d, String a, String s, int m) {
		director = d;
		title = t;
		actor = a;
		actress = s;
		minutes = m;
	}

	public String getDirector() {
		return director;
	}

	public String getTitle() {
		return title;
	}

	public int getMinutes() {
		return minutes;
	}

	public String getActor() {
		return actor;
	}

	public String getActress() {
		return actress;
	}

	@Override
	public String toString() {
		return "Video - Director=" + director + ", Title=" + title + ", Actor=" + actor + ", Actress=" + actress
				+ ", Minutes=" + minutes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		if (actor == null) {
			if (other.actor != null)
				return false;
		} else if (!actor.equals(other.actor))
			return false;
		if (actress == null) {
			if (other.actress != null)
				return false;
		} else if (!actress.equals(other.actress))
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (minutes != other.minutes)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
