package edu.mira.aula.shared.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import edu.mira.aula.shared.enum.ToastType
import kotlin.shido.com.androidutilities.R

/**
 * Created by mira on 31/07/2017.
 */
inline fun <reified T: Activity> Activity.startActivity(b: Bundle?){
    startActivity(Intent(this, T::class.java).putExtras(b))
}


/** *********************
 *
 * View model providers
 *
 * ********************* */
/*
inline fun <reified T: ViewModel> AppCompatActivity.viewModel(crossinline f: () -> T): T {
    return ViewModelProviders.of(this, factory(f)).get(T::class.java)
}

@Suppress("UNCHECKED_CAST")
inline fun <VM : ViewModel> factory(crossinline f: () -> VM) = object : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>?): T {
        return f() as T
    }
}
*/




fun String.toCamelCase() : String{
    val words = this.split(" ".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()
    val sb = StringBuilder()
    if (words[0].length > 0) {
        sb.append(Character.toUpperCase(words[0].get(0)) + words[0].subSequence(1, words[0].length).toString().toLowerCase())
        for (i in 1..words.size - 1) {
            if (words[i].length > 0) {
                sb.append(" ")
                sb.append(Character.toUpperCase(words[i].get(0)) + words[i].subSequence(1, words[i].length).toString().toLowerCase())
            }
        }
    }
    return sb.toString()
}

/**
 * Generic Toast function that shows a customized Toast when user completes an Occurrence Action
 *//*
fun Context.createMiraToast(toastType: ToastType): Toast{
    val toastView = LayoutInflater.from(this).inflate(R.layout.toast_mira_custom, null)
    val image = toastView.findViewById<ImageView>(R.id.toast_mira_custom_image)
    when (toastType){
        ToastType.CREATE -> image.setImageResource(R.drawable.ic_toast_occurrence_create)
        ToastType.UPDATE -> image.setImageResource(R.drawable.ic_toast_occurence_edited)
        ToastType.DELETE -> image.setImageResource(R.drawable.ic_toast_occurrence_deleted)
    }
    val toast = Toast(this)
    toast.view = toastView
    toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0, 0)
    toast.duration = Toast.LENGTH_LONG
    return toast
}
*/


fun EditText.onTextChanged(onTextChanged: (String) -> Unit){
    this.addTextChangedListener(object : TextWatcher{
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           onTextChanged.invoke(s.toString())
        }

    })
}

fun Any.e(any: Any?="no message provided"){
    Log.e(this.javaClass.simpleName + " - " , any.toString())
}


