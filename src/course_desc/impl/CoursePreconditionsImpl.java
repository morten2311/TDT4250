/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.CoursePreconditions;
import course_desc.Course_descPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Preconditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.CoursePreconditionsImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link course_desc.impl.CoursePreconditionsImpl#getReductionPoints <em>Reduction Points</em>}</li>
 *   <li>{@link course_desc.impl.CoursePreconditionsImpl#isIsRecommended <em>Is Recommended</em>}</li>
 *   <li>{@link course_desc.impl.CoursePreconditionsImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursePreconditionsImpl extends MinimalEObjectImpl.Container implements CoursePreconditions {
	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReductionPoints() <em>Reduction Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionPoints()
	 * @generated
	 * @ordered
	 */
	protected static final double REDUCTION_POINTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReductionPoints() <em>Reduction Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReductionPoints()
	 * @generated
	 * @ordered
	 */
	protected double reductionPoints = REDUCTION_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRecommended() <em>Is Recommended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRecommended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RECOMMENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRecommended() <em>Is Recommended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRecommended()
	 * @generated
	 * @ordered
	 */
	protected boolean isRecommended = IS_RECOMMENDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected Course belongsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursePreconditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.COURSE_PRECONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_PRECONDITIONS__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReductionPoints() {
		return reductionPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReductionPoints(double newReductionPoints) {
		double oldReductionPoints = reductionPoints;
		reductionPoints = newReductionPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_PRECONDITIONS__REDUCTION_POINTS, oldReductionPoints, reductionPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRecommended() {
		return isRecommended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRecommended(boolean newIsRecommended) {
		boolean oldIsRecommended = isRecommended;
		isRecommended = newIsRecommended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_PRECONDITIONS__IS_RECOMMENDED, oldIsRecommended, isRecommended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (Course)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(Course newBelongsTo) {
		Course oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO, oldBelongsTo, belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.COURSE_PRECONDITIONS__IS_REQUIRED:
				return isIsRequired();
			case Course_descPackage.COURSE_PRECONDITIONS__REDUCTION_POINTS:
				return getReductionPoints();
			case Course_descPackage.COURSE_PRECONDITIONS__IS_RECOMMENDED:
				return isIsRecommended();
			case Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.COURSE_PRECONDITIONS__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__REDUCTION_POINTS:
				setReductionPoints((Double)newValue);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__IS_RECOMMENDED:
				setIsRecommended((Boolean)newValue);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO:
				setBelongsTo((Course)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_PRECONDITIONS__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__REDUCTION_POINTS:
				setReductionPoints(REDUCTION_POINTS_EDEFAULT);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__IS_RECOMMENDED:
				setIsRecommended(IS_RECOMMENDED_EDEFAULT);
				return;
			case Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO:
				setBelongsTo((Course)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.COURSE_PRECONDITIONS__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case Course_descPackage.COURSE_PRECONDITIONS__REDUCTION_POINTS:
				return reductionPoints != REDUCTION_POINTS_EDEFAULT;
			case Course_descPackage.COURSE_PRECONDITIONS__IS_RECOMMENDED:
				return isRecommended != IS_RECOMMENDED_EDEFAULT;
			case Course_descPackage.COURSE_PRECONDITIONS__BELONGS_TO:
				return belongsTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isRequired: ");
		result.append(isRequired);
		result.append(", reductionPoints: ");
		result.append(reductionPoints);
		result.append(", isRecommended: ");
		result.append(isRecommended);
		result.append(')');
		return result.toString();
	}

} //CoursePreconditionsImpl
