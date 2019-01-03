# CodiceFiscale
Geratore Codice Fiscale Italiano. Italian Fiscal Code Generator. Without GUI.  

# Cognome (tre lettere)
Vengono prese le consonanti del cognome (o dei cognomi, se ve ne è più di uno) nel loro ordine (primo cognome, di seguito il secondo e così via). Se le consonanti sono insufficienti, si prelevano anche le vocali (se sono sufficienti le consonanti si prelevano la prima la seconda e la terza consonante), sempre nel loro ordine e, comunque, le vocali vengono riportate dopo le consonanti (per esempio: Rosi → RSO). Nel caso in cui un cognome abbia meno di tre lettere, la parte di codice viene completata aggiungendo la lettera X (per esempio: Fo → FOX). Per le donne, viene preso in considerazione il solo cognome da nubile.

# Nome (tre lettere)
Vengono prese le consonanti del nome (o dei nomi, se ve ne è più di uno) nel loro ordine (primo nome, di seguito il secondo e così via) in questo modo: se il nome contiene quattro o più consonanti, si scelgono la prima, la terza e la quarta (per esempio: Gianfranco → GFR), altrimenti le prime tre in ordine (per esempio: Tiziana → TZN). Se il nome non ha consonanti a sufficienza, si prendono anche le vocali; in ogni caso le vocali vengono riportate dopo le consonanti (per esempio: Luca → LCU). Nel caso in cui il nome abbia meno di tre lettere la parte di codice viene completata aggiungendo la lettera X.

# Data di nascita e sesso (cinque caratteri alfanumerici)
Anno di nascita (due cifre): si prendono le ultime due cifre dell'anno di nascita;
Mese di nascita (una lettera): a ogni mese dell'anno viene associata una lettera

# Giorno di nascita e sesso (due cifre)
si prendono le due cifre del giorno di nascita (se è compreso tra 1 e 9 si pone uno zero come prima cifra); per i soggetti di sesso femminile, a tale cifra va sommato il numero 40. In questo modo il campo contiene la doppia informazione giorno di nascita e sesso.

# Comune (o Stato) di nascita (quattro caratteri alfanumerici)
Per identificare il comune di nascita si utilizza il codice detto Belfiore, composto da una lettera e tre cifre numeriche. Per i nati al di fuori del territorio italiano, sia cittadini stranieri sia cittadini italiani nati all'estero, si considera lo stato estero di nascita; in tal caso la sigla inizia con la lettera Z, seguita dal numero identificativo dello stato.
Il codice Belfiore è lo stesso usato per il nuovo Codice catastale.

# Carattere di Controllo 
A partire dai quindici caratteri alfanumerici ricavati in precedenza, si determina il carattere di controllo (indicato a volte come CIN, Control Internal Number) in base a un particolare algoritmo
