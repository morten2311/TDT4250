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
 *   <li>{@link course_desc.Student#getFinishedExams <em>Finished Exams</em>}</li>
 *   <li>{@link course_desc.Student#getTotalStudyPoints <em>Total Study Points</em>}</li>
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
	 * Returns the value of the '<em><b>Finished Exams</b></em>' reference list.
	 * The list contents are of type {@link course_desc.Exam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished Exams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished Exams</em>' reference list.
	 * @see course_desc.Course_descPackage#getStudent_FinishedExams()
	 * @model
	 * @generated
	 */
	EList<Exam> getFinishedExams();

	/**
	 * Returns the value of the '<em><b>Total Study Points</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Study Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Study Points</em>' attribute.
	 * @see course_desc.Course_descPackage#getStudent_TotalStudyPoints()
	 * @model default="0" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getTotalStudyPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model
	 * @generated NOT
	 */
	boolean signUpForExam(Exam exam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean cancelExam(Exam exam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean takeExam(Exam exam);

} // Student
