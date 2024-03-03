
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class UnitConverterActivity extends AppCompatActivity {

    private Spinner spinnerFromUnit;
    private Spinner spinnerToUnit;
    private EditText editTextValue;
    private TextView textViewResult;

    private String[] lengthUnits = {"Meter", "Kilometer", "Mile", "Foot", "Inch"};
    private double[] lengthUnitValues = {1.0, 1000.0, 1609.34, 0.3048, 0.0254};

    private String[] weightUnits = {"Kilogram", "Gram", "Pound", "Ounce"};
    private double[] weightUnitValues = {1.0, 0.001, 0.453592, 0.0283495};

    private String[] temperatureUnits = {"Celsius", "Fahrenheit", "Kelvin"};
    private String[] temperatureUnitSymbols = {"°C", "°F", "K"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        spinnerFromUnit = findViewById(R.id.spinnerFromUnit);
        spinnerToUnit = findViewById(R.id.spinnerToUnit);
        editTextValue = findViewById(R.id.editTextValue);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<String> unitAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lengthUnits);
        spinnerFromUnit.setAdapter(unitAdapter);
        spinnerToUnit.setAdapter(unitAdapter);

        spinnerFromUnit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                convertUnit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerToUnit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                convertUnit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void convertUnit() {
        String selectedFromUnit = spinnerFromUnit.getSelectedItem().toString();
        String selectedToUnit = spinnerToUnit.getSelectedItem().toString();
        double inputValue = Double.parseDouble(editTextValue.getText().toString());

        double fromUnitValue = getUnitValue(selectedFromUnit);
        double toUnitValue = getUnitValue(selectedToUnit);

        double result = inputValue * fromUnitValue / toUnitValue;

        DecimalFormat decimalFormat = new DecimalFormat("#.##########");
        String formattedResult = decimalFormat.format(result);

        textViewResult.setText(formattedResult);
    }

    public double getUnitValue(String unit) {
        if (unit.equals("Meter")) {
            return lengthUnitValues[0];
        } else if (unit.equals("Kilometer")) {
            return lengthUnitValues[1];
        } else if (unit.equals("Mile")) {
            return lengthUnitValues[2];
        } else if (unit.equals("Foot")) {
            return lengthUnitValues[3];
        } else if (unit.equals("Inch")) {
            return lengthUnitValues[4];
        } else if (unit.equals("Kilogram")) {
            return weightUnitValues[0];
        } else if (unit.equals("Gram")) {
            return weightUnitValues[1];
        } else if (unit.equals("Pound")) {
            return weightUnitValues[2];
        } else if (unit.equals("Ounce")) {
            return weightUnitValues[3];
        } else {
            return 1.0; // Default value
        }
    }
}
