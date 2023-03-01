package com.gaurav.interactionplusemminusandreset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaurav.interactionplusemminusandreset.databinding.ActivityMainBinding

class InteractionPluseMinusandresetActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    lateinit var fragmentInterface:FragmentInterface



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnadd.setOnClickListener {
            fragmentInterface.plus(1)

        }
        binding.btnminus.setOnClickListener {
            fragmentInterface.minus(1)
        }

}}