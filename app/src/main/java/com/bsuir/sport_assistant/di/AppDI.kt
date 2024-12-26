package com.bsuir.sport_assistant.di

import com.bsuir.sport_assistant.data.dao.AuthDao
import com.bsuir.sport_assistant.data.dao.database.PersonDatabase
import com.bsuir.sport_assistant.data.dao.PersonDao
import com.bsuir.sport_assistant.data.dao.PlaceDao
import com.bsuir.sport_assistant.data.dao.UserDao
import com.bsuir.sport_assistant.data.dao.database.AuthDatabase
import com.bsuir.sport_assistant.data.dao.database.PlaceDatabase
import com.bsuir.sport_assistant.data.dao.database.UserDatabase
import com.bsuir.sport_assistant.data.repository.UserRepositoryImpl
import com.bsuir.sport_assistant.domain.repository.UserRepository
import com.bsuir.sport_assistant.domain.usercase.SaveUserUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpAuthUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpPersonUseCase
import com.bsuir.sport_assistant.domain.usercase.SignUpPlaceUseCase
import com.bsuir.sport_assistant.presentation.viewmodel.UserViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //viewmodel
    viewModel<UserViewModel> {
        UserViewModel(signUpPersonUserCase = get(),
            signUpPlaceUseCase = get(),
            signUpAuthUseCase = get(),
            saveUserUseCase = get())
    }

    //usecase
    factory<SignUpPersonUseCase> {
        SignUpPersonUseCase(userRepository = get())
    }

    factory<SignUpPlaceUseCase> {
        SignUpPlaceUseCase(userRepository = get())
    }

    factory<SignUpAuthUseCase>{
        SignUpAuthUseCase(userRepository = get())
    }

    factory<SaveUserUseCase>{
        SaveUserUseCase(userRepository = get())
    }

    //repository
    single<UserRepository> {
        UserRepositoryImpl(
            personDao = get(),
            placeDao = get(),
            authDao = get(),
            userDao = get()
        )
    }


    // DAO
    factory<UserDao> {
        UserDatabase.getDatabase(get()).userDao()
    }
    factory<PersonDao> {
        PersonDatabase.getDatabase(get()).personDao()
    }
    factory<PlaceDao> {
        PlaceDatabase.getDatabase(get()).placeDao()
    }
    factory<AuthDao> {
        AuthDatabase.getDatabase(get()).authDao()
    }

}