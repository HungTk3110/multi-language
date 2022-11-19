package com.example.test

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.viewbinding.ViewBinding
import com.bangcodin.calculator.utils.SharePreference
import com.example.test.databinding.ActivityMainBinding
import com.example.test.utils.LocaleHelper

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

//        checkCurrentLanguage()

        super.onCreate(savedInstanceState)

    }

    override fun setLayout():
            ViewBinding =
        ActivityMainBinding.inflate(layoutInflater) as ViewBinding

    override fun initView(binding: ViewBinding) {
        this.binding = binding as ActivityMainBinding
        setContentView(binding.root)


        binding.button.setOnClickListener {
            LocaleHelper().setLocale(this, "en")
            SharePreference.setStringPref(application, SharePreference.CURRENT_LANGUAGE, "en")
            recreate()
        }
        binding.button2.setOnClickListener {
            LocaleHelper().setLocale(this, "vi")
            SharePreference.setStringPref(application, SharePreference.CURRENT_LANGUAGE, "vi")
            recreate()
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        binding.button5.setOnClickListener {
            val f = BlankFragment()
            val t: FragmentTransaction = supportFragmentManager.beginTransaction()
            t.replace(binding.FrameLayout.id, f).commit()
        }
    }
}

//    override fun attachBaseContext(base: Context) {
//        LocaleHelper().setLocale(base, LocaleHelper().getLanguage(base))
//        super.attachBaseContext(LocaleHelper().onAttach(base))
//    }

//    private fun checkCurrentLanguage(){
//        val currentLanguage =
//            SharePreference.getStringPref(application, SharePreference.CURRENT_LANGUAGE)
//        if(currentLanguage.isNullOrEmpty()){
//            LocaleHelper().setLocale(this,"en")
//        }else{
//            LocaleHelper().setLocale(this,currentLanguage)
//        }
//    }
