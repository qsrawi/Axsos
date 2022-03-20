package com.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.languages.models.Language;
import com.languages.repos.LanguageRepo;

@Service
public class LanguageService {
	@Autowired
	LanguageRepo languageRepo;
public List<Language> allLanguages(){
return languageRepo.findAll();
}
public Language create(Language language) {
	return languageRepo.save(language);
}
public Language update(Language language) {
	Language updatedlang = languageRepo.findById(language.getId()).orElse(null);
	updatedlang.setName(language.getName());
	updatedlang.setCreator(language.getCreator());
	updatedlang.setVersion(language.getVersion());
    	return languageRepo.save(updatedlang);
}
public Language findLang(Long id) {
    Optional<Language> optionalLanguage = languageRepo.findById(id);
    if(optionalLanguage.isPresent()) {
        return optionalLanguage.get();
    } else {
        return null;
    }
}


public void delete (Long id) {
	languageRepo.deleteById(id);
}

}