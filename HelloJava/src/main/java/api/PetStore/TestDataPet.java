package api.PetStore;

public class TestDataPet {

    /*
    1. Сделать генерируемый айдишник питомца для успешного запроса
    1.2 Сделать постовый запрос который создает питомца с загенеренным айдишником и каким-то набором загенерреных параметров
    2. В тесте проверятьчто нам вернулся именно тот айдишник что я загенерил
    4. В тесте проверять что вернулись конкретные параметры
    5. Потренироваться еще на паре запросов (PUT, DELETE)
    6. Перейти на UI тесты
    7. Посмотерть методы фроеймворка для UI
    8. Написать несколько тестов для разных форма на DEMOQA
    8.1...
    9. Развернуть БД и как то ее наполнить
    10. Попробовать организовать тесты на БД
     */

    public static final String SUCCESS_RESPONSE_200 = "/pet/7777778";
    public static final String PET_NOT_FOUND_404_STRING = "/pet/Любой текст";
    public static final String PET_NOT_FOUND_404_OOB_1 = "/pet/-1";
    public static final String PET_NOT_FOUND_404_NOT_ID = "/pet/";
    public static final String PET_NOT_FOUND_404_OOB_2 = "/pet/99999999999999";


}
