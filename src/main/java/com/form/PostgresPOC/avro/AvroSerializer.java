package com.form.PostgresPOC.avro;

import com.form.PostgresPOC.model.Employee;
import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;


@Service
public class AvroSerializer {

    public DataFileWriter<Employee>  serialize(Employee employee) throws IOException {

//        String fileName = "/emp.avsc";
//        ClassLoader classLoader = new AvroSerializer().getClass().getClassLoader();
//        File file = new File(classLoader.getResource(fileName).getFile());

        Schema schema = new Schema.Parser().parse(ResourceUtils.getFile("classpath:emp.avsc"));
      //  DatumWriter<Employee> empDatumWriter = new SpecificDatumWriter<Employee>(Employee.class);
        DatumWriter<Employee> empDatumWriter = new ReflectDatumWriter(schema);

        DataFileWriter<Employee> empFileWriter = new DataFileWriter<Employee>(empDatumWriter);



        empFileWriter.create(schema, new File("C:/Equifax/Environment/IntelliJ_Workspace/PostgresDemoApplication/PostgresDemoApplication/src/main/resources/emp.json"));
       empFileWriter.append(employee);
        empFileWriter.close();
        return empFileWriter;

    }




    public static void Deserialize() throws IOException{

        //DeSerializing the objects
        DatumReader<Employee> empDatumReader = new SpecificDatumReader<Employee>(Employee.class);
        //Instantiating DataFileReader
        DataFileReader<Employee> dataFileReader = new DataFileReader<Employee>(new
                File("/Users/nisum/Postgres_Pract/avro/emp.avro"), empDatumReader);
        Employee em=null;
        while(dataFileReader.hasNext()){
            em=dataFileReader.next(em);
            System.out.println(em);
        }
    }
}
