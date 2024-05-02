package com.ubanesh.realm_database

import android.app.Application
import com.ubanesh.realm_database.model.Address
import com.ubanesh.realm_database.model.Course
import com.ubanesh.realm_database.model.Student
import com.ubanesh.realm_database.model.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application( ) {
    companion object{
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class,
                )
            )
        )
    }
}