package my.home.oop.task03.main;

import java.util.ArrayList;
import java.util.List;

import my.home.oop.task03.entity.Calendar.Month;
import my.home.oop.task03.entity.Calendar.Month.Week;

import my.home.oop.task03.logic.CalendarLogic;
import my.home.oop.task03.entity.Calendar;

/*Создать Класс календарь с внутренним классом.С помощью которого можно хранить информацию о выходных и праздничных днях*/
public class Main {

	public static void main(String[] args) {

		CalendarLogic logic = new CalendarLogic();

		Calendar.Month.Week firstWeek = new Calendar().new Month().new Week(logic.createDays(1, 7));
		Calendar.Month.Week secondWeek = new Calendar().new Month().new Week(logic.createDays(8, 14));
		Calendar.Month.Week thirdWeek = new Calendar().new Month().new Week(logic.createDays(15, 21));
		Calendar.Month.Week fourthWeek = new Calendar().new Month().new Week(logic.createDays(22, 28));

		List<Week> weeksForFirstMonth = new ArrayList<>();
		weeksForFirstMonth.add(firstWeek);
		weeksForFirstMonth.add(secondWeek);
		weeksForFirstMonth.add(thirdWeek);
		weeksForFirstMonth.add(fourthWeek);

		Calendar.Month firstMonth = new Calendar().new Month(weeksForFirstMonth);

		Calendar.Month.Week weekOne = new Calendar().new Month().new Week(logic.createDays(1, 7));
		Calendar.Month.Week weekTwo = new Calendar().new Month().new Week(logic.createDays(8, 14));
		Calendar.Month.Week weekThree = new Calendar().new Month().new Week(logic.createDays(15, 21));
		Calendar.Month.Week weekFour = new Calendar().new Month().new Week(logic.createDays(22, 28));
		Calendar.Month.Week weekFive = new Calendar().new Month().new Week(logic.createDays(29, 31));

		List<Week> weeksForSecondMonth = new ArrayList<>();

		weeksForSecondMonth.add(weekOne);
		weeksForSecondMonth.add(weekTwo);
		weeksForSecondMonth.add(weekThree);
		weeksForSecondMonth.add(weekFour);
		weeksForSecondMonth.add(weekFive);

		Calendar.Month secondMonth = new Calendar().new Month(weeksForSecondMonth);

		List<Month> months = new ArrayList<>();

		months.add(secondMonth);
		months.add(firstMonth);

		Calendar calendar = new Calendar(months);

	}
}
