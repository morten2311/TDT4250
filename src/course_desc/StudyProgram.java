/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.StudyProgram#getStudyCode <em>Study Code</em>}</li>
 *   <li>{@link course_desc.StudyProgram#getOffers <em>Offers</em>}</li>
 *   <li>{@link course_desc.StudyProgram#getBelongs <em>Belongs</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getStudyProgram()
 * @model
 * @generated
 */
public interface StudyProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Code</b></em>' attribute.
	 * The literals are from the enumeration {@link course_desc.StudyProgramCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Code</em>' attribute.
	 * @see course_desc.StudyProgramCode
	 * @see #setStudyCode(StudyProgramCode)
	 * @see course_desc.Course_descPackage#getStudyProgram_StudyCode()
	 * @model
	 * @generated
	 */
	StudyProgramCode getStudyCode();

	/**
	 * Sets the value of the '{@link course_desc.StudyProgram#getStudyCode <em>Study Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Code</em>' attribute.
	 * @see course_desc.StudyProgramCode
	 * @see #getStudyCode()
	 * @generated
	 */
	void setStudyCode(StudyProgramCode value);

	/**
	 * Returns the value of the '<em><b>Offers</b></em>' reference list.
	 * The list contents are of type {@link course_desc.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offers</em>' reference list.
	 * @see course_desc.Course_descPackage#getStudyProgram_Offers()
	 * @model
	 * @generated
	 */
	EList<Course> getOffers();

	/**
	 * Returns the value of the '<em><b>Belongs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course_desc.Department#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs</em>' container reference.
	 * @see #setBelongs(Department)
	 * @see course_desc.Course_descPackage#getStudyProgram_Belongs()
	 * @see course_desc.Department#getManages
	 * @model opposite="manages" required="true" transient="false"
	 * @generated
	 */
	Department getBelongs();

	/**
	 * Sets the value of the '{@link course_desc.StudyProgram#getBelongs <em>Belongs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs</em>' container reference.
	 * @see #getBelongs()
	 * @generated
	 */
	void setBelongs(Department value);

} // StudyProgram
