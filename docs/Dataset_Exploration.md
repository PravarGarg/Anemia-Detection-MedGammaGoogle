This is a note about the dataset exploration for this project. 

All datasets are downloaded from Kaggle. The link to all the datasets referenced to in this project is mentioned below. 

For this implementation, these two datasets have been processed, normalised and combined to achieve better performance

1) EYES-DEFY-ANEMIA: 
Kaggle Link : https://www.kaggle.com/datasets/harshwardhanfartale/eyes-defy-anemia?resource=download

- raw and processed images of the dataset is available in the data section 
- the dataset contains images of Indian and Italian patients - in the ratio of 95:123, hence there are 95 samples of Indian patients and 123 samples of Italian Patients - therefore, in total there are 218 samples. 
- contains 'Hgb' column which contains the haemoglobin values of each image
- from the haemoglobin values we can categorize and label the data on the basis of Severity - 'Severe', 'Moderate', 'Mild', 'None'

(i) Class Imbalance Issue - 
On the basis of severity labelling, it is concluded that this dataset suffers from class imbalance with the value counts per Indian and Italian patients being - 

India counts: Severity
None        39
Moderate    38
Mild        16
Severe       2
Name: count, dtype: int64
Italy counts: Severity
None        87
Moderate    13
Mild         6
Severe       1

Hence, we can say that this model is heavily biased towards 'None' class or normal cases. 

(ii) Proposed Solution to the class imbalance issue - 

- Light Augmentation for rare classes (Severe class) with the target being approx 15-20 images
Creating new version of rare class images with slight variations - rotation, brightness change, flip - giving the model different images to learn from 

- Class Weights during the fine tuning stage with a 8x penalty for severe misclassification 
8x penalty is imposed on the model for misclassifying a rare class - directly encodes the costly scenario in which a clinic mistreats or misdiagnoses a severe injury. 



