package com.ubanesh.realm_database.model

import io.realm.kotlin.Realm
import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Teacher: RealmObject{
    @PrimaryKey var _id: ObjectId = ObjectId()
    var address: Address? = null
    var courses: RealmList<Course> = realmListOf()
}