package com.example.advweek4.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advweek4.model.Student

class DetailListModel: ViewModel() {
    val studentLD = MutableLiveData<Student>()

    fun fetch()
    {
        val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student1
    }
    /*fun std(): MutableLiveData<Student> {
        return studentLD
    }*/

}