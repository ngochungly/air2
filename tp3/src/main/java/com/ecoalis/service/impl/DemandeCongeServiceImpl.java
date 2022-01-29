package com.ecoalis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoalis.dao.DemandeCongeDao;
import com.ecoalis.model.DemandeConge;
import com.ecoalis.service.DemandeCongeService;

@Service
public class DemandeCongeServiceImpl implements DemandeCongeService {

	@Autowired
   private DemandeCongeDao demandeCongeDao;

   public DemandeConge getDemandeEnCours() {
      return demandeCongeDao.getDemandeEnCours();
   }

}
