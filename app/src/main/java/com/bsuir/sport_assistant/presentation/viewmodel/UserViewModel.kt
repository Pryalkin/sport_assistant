package com.bsuir.sport_assistant.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bsuir.sport_assistant.domain.models.Auth
import com.bsuir.sport_assistant.domain.models.Person
import com.bsuir.sport_assistant.domain.models.Place
import com.bsuir.sport_assistant.domain.models.User
import com.bsuir.sport_assistant.domain.usercase.SaveUserUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpAuthUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpPersonUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpPlaceUseCase

class UserViewModel(
    private val signUpPersonUserCase: SignUpPersonUseCase,
    private val signUpPlaceUseCase: SignUpPlaceUseCase,
    private val signUpAuthUseCase: SignUpAuthUseCase,
    private val saveUserUseCase: SaveUserUseCase
): ViewModel() {

    private var personId: Long = 0
    private var placeId: Long = 0
    private var authId: Long = 0

    private var _user = MutableLiveData<Long>()
    var user: LiveData<Long> = _user

    fun signUpPersonUserCase(surname: String, name: String, patronymic: String, dateOfBirth: String) {
        val result = signUpPersonUserCase.execute(surname = surname, name = name,
            patronymic = patronymic, dateOfBirth = dateOfBirth)
        personId = result
    }

    fun signUpPlaceUserCase(country: String, city: String, street: String, house: String) {
        val result = signUpPlaceUseCase.execute(country = country, city = city,
            street = street, house = house)
        placeId = result
    }

    fun signUpAuthUserCase(email: String, numberPhone: String, password: String, checkPassword: String) {
        val result = signUpAuthUseCase.execute(email = email, numberPhone = numberPhone,
            password = password)
        authId = result
        val res = saveUserUseCase.execute(personId = personId, placeId = placeId, authId = authId)
        _user.value = res
    }



}