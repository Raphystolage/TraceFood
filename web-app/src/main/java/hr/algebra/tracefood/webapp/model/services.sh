#!/bin/bash

# Récupérer le répertoire actuel
repertoire=$(pwd)

# Répertoire de destination des fichiers de service
destination="$repertoire/../service"

# Créer le répertoire de destination s'il n'existe pas
mkdir -p "$destination"

# Parcourir tous les fichiers .java dans le répertoire
for fichier in "$repertoire"/*.java; do
  # Récupérer le nom de fichier sans extension
  nom_fichier=$(basename "$fichier" .java)
  
  # Créer le nouveau chemin de fichier avec le répertoire de destination et "Service" ajouté
  nouveau_chemin="$destination/${nom_fichier}Service.java"
  
  # Créer le contenu du nouveau fichier
  contenu="package hr.algebra.tracefood.webapp.service;
  
import hr.algebra.tracefood.webapp.model.${nom_fichier};

import org.springframework.stereotype.Service;

@Service
public class ${nom_fichier}Service extends AbstractClassicDBStorableService<${nom_fichier}> {

    public ${nom_fichier}Service() {
        super(\"/${nom_fichier,}\", ${nom_fichier}.class);
    }

}"
  
  # Écrire le contenu dans le nouveau fichier
  echo "$contenu" > "$nouveau_chemin"
  
  echo "Le fichier $nouveau_nom a été créé."
done
