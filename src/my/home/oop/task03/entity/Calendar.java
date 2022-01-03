package my.home.oop.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private List<Month> months;

	public Calendar() {
		months = new ArrayList<>();
	}

	public Calendar(List<Month> months) {

		this.months = months;
	}

	public class Month {

		private List<Week> weeks;

		public Month() {
			weeks = new ArrayList<>();
		}

		public Month(List<Week> weeks) {
			this.weeks = weeks;

		}

		public class Week {

			private List<Day> days;

			public Week() {
				days = new ArrayList<Day>();
			}

			public Week(List<Day> days) {
				this.days = days;
			}

			public class Day {
				private int date;
				private boolean dayOff;

				public Day() {
					date = 1;
					dayOff = false;
				}

				public Day(int date, boolean dayOff) {
					this.date = date;
					this.dayOff = dayOff;
				}

				public int getDate() {
					return date;
				}

				public void setDate(int date) {
					this.date = date;
				}

				public boolean isDayOff() {
					return dayOff;
				}

				public void setDayOff(boolean dayOff) {
					this.dayOff = dayOff;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + getEnclosingInstance().hashCode();
					result = prime * result + date;
					result = prime * result + (dayOff ? 1231 : 1237);
					return result;
				}

				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Day other = (Day) obj;
					if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
						return false;
					if (date != other.date)
						return false;
					if (dayOff != other.dayOff)
						return false;
					return true;
				}

				private Week getEnclosingInstance() {
					return Week.this;
				}

				@Override
				public String toString() {
					return getClass().getSimpleName() + "[date=" + date + ", dayOff=" + dayOff + "]";
				}

			}

			public List<Day> getDays() {
				return days;
			}

			public void setDays(List<Day> days) {
				this.days = days;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + ((days == null) ? 0 : days.hashCode());
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Week other = (Week) obj;
				if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
					return false;
				if (days == null) {
					if (other.days != null)
						return false;
				} else if (!days.equals(other.days))
					return false;
				return true;
			}

			private Month getEnclosingInstance() {
				return Month.this;
			}

			@Override
			public String toString() {
				return getClass().getSimpleName() + " [days=" + days + "]";
			}

		}

		public List<Week> getWeeks() {
			return weeks;
		}

		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Month other = (Month) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (weeks == null) {
				if (other.weeks != null)
					return false;
			} else if (!weeks.equals(other.weeks))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + "[weeks=" + weeks + "]";
		}

	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((months == null) ? 0 : months.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (months == null) {
			if (other.months != null)
				return false;
		} else if (!months.equals(other.months))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [months=" + months + "]";
	}

}
