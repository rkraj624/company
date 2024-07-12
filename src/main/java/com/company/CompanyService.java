package com.company;

import com.company.entity.Company;
import com.company.entity.Review;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CompanyService {
    private String BASE_REVIEW_URL="http://REVIEW-SERVICE:8082/reviews";
    private final CompanyRepository companyRepository;
    private final RestTemplate restTemplate;

    public CompanyService(CompanyRepository companyRepository, RestTemplate restTemplate) {
        this.companyRepository = companyRepository;
        this.restTemplate = restTemplate;
    }

    
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    
    public boolean updateCompany(String id, Company company) {
        try {
            Company dbCompany = companyRepository.findById(id).orElse(null);
            if(dbCompany != null){
                dbCompany.setDescription(company.getDescription());
                dbCompany.setName(company.getName());
                companyRepository.save(dbCompany);
                return true;
            }
            return false;
        }catch (Exception exception){
            exception.printStackTrace();
            return false;
        }

    }

    
    public boolean deleteCompanyById(String id) {
        try {
            boolean company = companyRepository.existsById(id)
;            if(company){
                companyRepository.deleteById(id);
                return true;
            }
            return false;
        }catch (Exception exception){
            exception.printStackTrace();
            return false;
        }

    }

    
    public Company getCompanyById(String id) {
        return companyRepository.findById(id).orElse(null);
    }
}
