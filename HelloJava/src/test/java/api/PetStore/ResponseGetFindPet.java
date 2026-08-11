package api.PetStore;

import api.PetStore.Pojo.PogoForGetPetByID.DataPetFullResponce;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static api.PetStore.TestDataPet.*;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class ResponseGetFindPet {

    @Test
    @DisplayName("Успешный запрос и проверка полей ответа")
    public void getPetInfoSuccess() {

        FacadePet facadePet = new FacadePet();

        assertThat(facadePet.getPetsStatusCode(SUCCESS_RESPONSE_200))
                .as("Статус код неверен")//Обработчик ошибок, если еквайл провлится
                .isEqualTo(200);
        log.info("Код ответа: {}, ожидался: 200", facadePet.getPetsStatusCode(SUCCESS_RESPONSE_200)); //логирование, добавляется через аннотацию

        DataPetFullResponce pet = facadePet.getPets(SUCCESS_RESPONSE_200);

        assertThat(pet.getId())
                .as("ID пусто")//Обработчик ошибок, если еквайл провлится
                .isNotNull();

        assertThat(pet.getName()).isNotNull()
                .as("Name пусто")//Обработчик ошибок, если еквайл провлится
                .isNotNull();

        assertThat(pet.getStatus()).isNotNull()
                .as("Status пусто")//Обработчик ошибок, если еквайл провлится
                .isNotNull();
    }

    @Test
    @DisplayName("Делаем запрос с некорретным ID (Кириллица)")
    public void getPetInfoFailString() {

        FacadePet facadePet = new FacadePet();

        assertThat(facadePet.getPetsStatusCode(PET_NOT_FOUND_404_STRING))
                .as("Статус код неверен")//Обработчик ошибок, если еквайл провлится
                .isEqualTo(404);
        log.info("Код ответа: {}, ожидался: 404", facadePet.getPetsStatusCode(PET_NOT_FOUND_404_STRING)); //логирование, добавляется через аннотацию
    }

    @Test
    @DisplayName("Делаем запрос с некорретным ID (OOB)")
    public void getPetInfoFailOobOne() {

        FacadePet facadePet = new FacadePet();

        assertThat(facadePet.getPetsStatusCode(PET_NOT_FOUND_404_OOB_1))
                .as("Статус код неверен")//Обработчик ошибок, если еквайл провлится
                .isEqualTo(404);
        log.info("Код ответа: {}, ожидался: 404", facadePet.getPetsStatusCode(PET_NOT_FOUND_404_OOB_1)); //логирование, добавляется через аннотацию
    }

    @Test
    @DisplayName("Делаем запрос без ID")
    public void getPetInfoFailNoID() {

        FacadePet facadePet = new FacadePet();

        assertThat(facadePet.getPetsStatusCode(PET_NOT_FOUND_404_NOT_ID))
                .as("Статус код неверен")//Обработчик ошибок, если еквайл провлится
                .isEqualTo(405);
        log.info("Код ответа: {}, ожидался: 405", facadePet.getPetsStatusCode(PET_NOT_FOUND_404_NOT_ID)); //логирование, добавляется через аннотацию
    }

    @Test
    @DisplayName("Делаем запрос без ID")
    public void getPetInfoFailOobTwo() {

        FacadePet facadePet = new FacadePet();

        assertThat(facadePet.getPetsStatusCode(PET_NOT_FOUND_404_OOB_2))
                .as("Статус код неверен")//Обработчик ошибок, если еквайл провлится
                .isEqualTo(404);
        log.info("Код ответа: {}, ожидался: 405", facadePet.getPetsStatusCode(PET_NOT_FOUND_404_OOB_2)); //логирование, добавляется через аннотацию
    }
}
