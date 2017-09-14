/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Department#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link course_desc.Department#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.Department#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link course_desc.CourseInstance#getIsInstanceOf <em>Is Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getDepartment_Responsible()
	 * @see course_desc.CourseInstance#getIsInstanceOf
	 * @model opposite="isInstanceOf" containment="true"
	 * @generated
	 */
	EList<CourseInstance> getResponsible();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course_desc.Course_descPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course_desc.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manages</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.StudyProgram}.
	 * It is bidirectional and its opposite is '{@link course_desc.StudyProgram#getBelongs <em>Belongs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getDepartment_Manages()
	 * @see course_desc.StudyProgram#getBelongs
	 * @model opposite="belongs" containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgram> getManages();

} // Department
