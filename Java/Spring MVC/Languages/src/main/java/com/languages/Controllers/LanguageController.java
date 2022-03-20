package com.languages.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.languages.models.Language;
import com.languages.services.LanguageService;

@Controller
public class LanguageController {
@Autowired
LanguageService languageService;
@GetMapping("/languages")
public String getAllLang(Model model, Language language)
{
	List<Language> languages=languageService.allLanguages();
	model.addAttribute("languages",languages);
	System.out.println("oday");
	return "index.jsp";
}
@PostMapping("/languages")
public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
    if (result.hasErrors()) {
        return "redirect:/languages";
    } else {
       languageService.create(language);
        return "redirect:/languages";
    }
}
    
    @GetMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model, Language language) {
        Language expense = languageService.findLang(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
}
@PutMapping("/languages/{id}")
public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
    if (result.hasErrors()) {
        return "edit.jsp";
    } else {
    	languageService.update(language);
        return "redirect:/languages";
    }
}

@DeleteMapping("/languages/{id}")
public String destroy(@PathVariable("id") Long id) {
    languageService.delete(id);
    return "redirect:/languages";
}


}







