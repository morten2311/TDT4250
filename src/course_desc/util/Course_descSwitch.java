/**
 */
package course_desc.util;

import course_desc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see course_desc.Course_descPackage
 * @generated
 */
public class Course_descSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Course_descPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_descSwitch() {
		if (modelPackage == null) {
			modelPackage = Course_descPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Course_descPackage.COURSE: {
				Course course = (Course)theEObject;
				T result = caseCourse(course);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.COURSE_INSTANCE: {
				CourseInstance courseInstance = (CourseInstance)theEObject;
				T result = caseCourseInstance(courseInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.DEPARTMENT: {
				Department department = (Department)theEObject;
				T result = caseDepartment(department);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.EXAM: {
				Exam exam = (Exam)theEObject;
				T result = caseExam(exam);
				if (result == null) result = caseEvaluation(exam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.TIMETABLE: {
				Timetable timetable = (Timetable)theEObject;
				T result = caseTimetable(timetable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.COURSE_PRECONDITIONS: {
				CoursePreconditions coursePreconditions = (CoursePreconditions)theEObject;
				T result = caseCoursePreconditions(coursePreconditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.COURSE_WORK: {
				CourseWork courseWork = (CourseWork)theEObject;
				T result = caseCourseWork(courseWork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.STUDY_PROGRAM: {
				StudyProgram studyProgram = (StudyProgram)theEObject;
				T result = caseStudyProgram(studyProgram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.EVALUATION: {
				Evaluation evaluation = (Evaluation)theEObject;
				T result = caseEvaluation(evaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.PERSON_ROLE: {
				PersonRole personRole = (PersonRole)theEObject;
				T result = casePersonRole(personRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.UNIV: {
				Univ univ = (Univ)theEObject;
				T result = caseUniv(univ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.EVALUATION_WITH_DEADLINE: {
				EvaluationWithDeadline evaluationWithDeadline = (EvaluationWithDeadline)theEObject;
				T result = caseEvaluationWithDeadline(evaluationWithDeadline);
				if (result == null) result = caseEvaluation(evaluationWithDeadline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.STUDENT: {
				Student student = (Student)theEObject;
				T result = caseStudent(student);
				if (result == null) result = casePersonRole(student);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.LECTURER: {
				Lecturer lecturer = (Lecturer)theEObject;
				T result = caseLecturer(lecturer);
				if (result == null) result = casePersonRole(lecturer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Course_descPackage.COURSE_COORDINATOR: {
				CourseCoordinator courseCoordinator = (CourseCoordinator)theEObject;
				T result = caseCourseCoordinator(courseCoordinator);
				if (result == null) result = casePersonRole(courseCoordinator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseInstance(CourseInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Department</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartment(Department object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam(Exam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timetable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimetable(Timetable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Preconditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoursePreconditions(CoursePreconditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseWork(CourseWork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Study Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Study Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudyProgram(StudyProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation(Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonRole(PersonRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Univ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Univ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniv(Univ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation With Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation With Deadline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationWithDeadline(EvaluationWithDeadline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudent(Student object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lecturer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLecturer(Lecturer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Coordinator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseCoordinator(CourseCoordinator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Course_descSwitch
