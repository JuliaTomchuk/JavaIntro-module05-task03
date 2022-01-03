package my.home.oop.task03.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.oop.task03.entity.Calendar;
import my.home.oop.task03.entity.Calendar.Month.Week.Day;

public class CalendarLogic {

	public List<Day> createDays(int firstDay, int lastDay) {

		List<Day> days = new ArrayList<>();

		for (int i = firstDay; i < (lastDay + 1); i++) {

			if (i < (lastDay - 1)) {
				days.add(new Calendar().new Month().new Week().new Day(i, false));
			} else {
				days.add(new Calendar().new Month().new Week().new Day(i, true));
			}
		}
		return days;

	}

}
