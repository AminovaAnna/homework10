public class Main {
    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName); //задача1
        System.out.println( );
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName1); //задача2
        System.out.println( );
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2); //задача3


    }
}