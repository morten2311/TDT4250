/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Univ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Univ#getHasDepartment <em>Has Department</em>}</li>
 *   <li>{@link course_desc.Univ#getHasCourses <em>Has Courses</em>}</li>
 *   <li>{@link course_desc.Univ#getHasPersons <em>Has Persons</em>}</li>
 *   <li>{@link course_desc.Univ#getHasPrecond <em>Has Precond</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getUniv()
 * @model
 * @generated
 */
public interface Univ extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Department</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Department}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Department</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Department</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getUniv_HasDepartment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getHasDepartment();

	/**
	 * Returns the value of the '<em><b>Has Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Courses</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getUniv_HasCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getHasCourses();

	/**
	 * Returns the value of the '<em><b>Has Persons</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Persons</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getUniv_HasPersons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getHasPersons();

	/**
	 * Returns the value of the '<em><b>Has Precond</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.CoursePreconditions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Precond</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precond</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getUniv_HasPrecond()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoursePreconditions> getHasPrecond();

} // Univ
