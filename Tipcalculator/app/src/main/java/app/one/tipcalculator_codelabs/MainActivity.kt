package app.one.tipcalculator_codelabs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.one.tipcalculator_codelabs.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{calculateTip()}
    }

    private fun calculateTip(){
        val stringInTextField = binding.serviceCostEditText.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null || cost == 0.0){
            displayTip(0.0)
            return
        }
        val tipPercentage = when(binding.tipOptions.checkedRadioButtonId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_fifteen_percent -> 0.15
            else -> 0.10
        }
        var tip = cost*tipPercentage
        if (binding.roundUpSwitch.isChecked){
            tip = kotlin.math.ceil(tip)
        }
        displayTip(tip)
    }
    private fun displayTip(tip : Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.result.text = getString(R.string.tip_amount, formattedTip)
    }



}