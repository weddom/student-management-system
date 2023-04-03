package com.example.studentmanagement.controller;

        import com.example.studentmanagement.entity.Student;
        import com.example.studentmanagement.service.IStudentService;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private IStudentService studentService;

    public StudentController(IStudentService theStudentService) {
        studentService = theStudentService;
    }

    @GetMapping("/list")
    public String listStudents(Model theModel) {

        List<Student> theStudents = studentService.findAll();

        theModel.addAttribute("students", theStudents);

        return "students/list-students";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "students/student-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int theId,
                                    Model theModel) {

        Student theStudent = studentService.findById(theId);

        theModel.addAttribute("student", theStudent);

        return "students/student-form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student theStudent) {

        studentService.save(theStudent);

        return "redirect:/students/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int theId) {

        studentService.deleteById(theId);

        return "redirect:/students/list";

    }
}









