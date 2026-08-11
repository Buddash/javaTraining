package api.PetStore;

import api.PetStore.Pojo.PogoForGetPetByID.DataPetFullResponce;
import api.Service;
import io.qameta.allure.Step;
import io.restassured.response.Response;


public class FacadePet {

    private ServicePet serviceGetPet;

    public FacadePet() {
        this.serviceGetPet = new ServicePet();
    }

    @Step("Возвращаем код ответа")
    public int getPetsStatusCode(String petsIdEndp) {
        Response response = serviceGetPet.getpetsIdEndp(petsIdEndp);
        return response.statusCode();
    }

    @Step("Получаем всю информацию о питомце")
    public DataPetFullResponce getPets(String petsIdEndp) {
        Response response = serviceGetPet.getpetsIdEndp(petsIdEndp);
        return response.as(DataPetFullResponce.class);
    }
}
