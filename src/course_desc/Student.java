/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Student#getHasExams <em>Has Exams</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends PersonRole {
	/**
	 * Returns the value of the '<em><b>Has Exams</b></em>' reference list.
	 * The list contents are of type {@link course_desc.Exam}.
	 * It is bidirectional and its opposite is '{@link course_desc.Exam#getHasRegisteredStudents <em>Has Registered Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Exams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Exams</em>' reference list.
	 * @see course_desc.Course_descPackage#getStudent_HasExams()
	 * @see course_desc.Exam#getHasRegisteredStudents
	 * @model opposite="hasRegisteredStudents"
	 * @generated
	 */
	EList<Exam> getHasExams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void signUpForExam(Exam exam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelExam();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void takeExam();

} // Student
